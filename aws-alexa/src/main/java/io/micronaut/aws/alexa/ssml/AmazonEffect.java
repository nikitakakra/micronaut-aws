/*
 * Copyright 2017-2019 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.aws.alexa.ssml;

/**
 * Applies Amazon-specific effects to the speech.
 * @see <a href="https://developer.amazon.com/en-US/docs/alexa/custom-skills/speech-synthesis-markup-language-ssml-reference.html#amazon-effect">Amazon Effect</a>
 * @author sdelamo
 * @since 2.0.0
 */
public enum AmazonEffect {
    /**
     * Applies a whispering effect to the speech.
     */
    WHISPERED;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
