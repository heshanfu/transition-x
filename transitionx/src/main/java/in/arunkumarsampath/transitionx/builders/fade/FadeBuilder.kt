/*
 * Copyright 2018 Arunkumar
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

package `in`.arunkumarsampath.transitionx.builders.fade

import `in`.arunkumarsampath.transitionx.builders.TransitionBuilder
import android.support.transition.Fade
import android.support.transition.Fade.IN
import android.support.transition.Fade.OUT

class FadeBuilder(@FadeMode fadingMode: Int = IN or OUT) : TransitionBuilder<Fade>(Fade(fadingMode))