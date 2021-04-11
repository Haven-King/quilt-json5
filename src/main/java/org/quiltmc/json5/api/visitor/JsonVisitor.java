/*
 * Copyright 2021 QuiltMC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.quiltmc.json5.api.visitor;

import org.quiltmc.json5.api.exception.FormatViolationException;

import java.io.Closeable;
import java.io.IOException;

public interface JsonVisitor {
	default JsonObjectVisitor rootObject() {
		throw new FormatViolationException();
	}
	default JsonArrayVisitor rootArray() {
		throw new FormatViolationException();
	}

	default void rootString(String string) {
		throw new FormatViolationException();
	}

	default void rootBoolean(boolean bool) {
		throw new FormatViolationException();
	}

	default void rootNumber(Number number) {
		throw new FormatViolationException();
	}

	default void rootNull() {
		throw new FormatViolationException();
	}
}