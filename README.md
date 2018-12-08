# popupwindowComponent
Assignment 3 submission: Popup Window
by: Adrian De Braga
student id: N01153774
course: CENG 319 
section: ONC
Instructor: Austin Tian

# Introduction
I was chosen to use the PopupWindow as my component to work on and learn the basics of the class.
A Popup Window is basically a view that appears(pops up) on the screen. Normally, popup windows are used to either display more information
on something or an Ad, like for example: if i click someones name a popup would appear with a little menu if you want to follow them, message them, or
send a friend request. This component is really good for User Interface and also displaying more information. There are different types of
popup windows as a dropdown window.

# History
It was added in API level 1 of android studio, and in API level 23 they added animations to the popupwindows. It is a public class PopupWindow. 
The library is in java.lang.object as android.widget.PopupWindow. Before that happened the man who created popupwindows to begin with is
Ethan Zuckerman, after creating pop-up Ads he regretfully apologized creating one of the most hated forms of advertisments. “It was a way to 
associate an ad with a user’s page without putting it directly on the page, which advertisers worried would imply an association between
their brand and the page’s content. Specifically, we came up with it when a major car company freaked out that they’d bought a banner ad 
on a page that celebrated ***. I wrote the code to launch the window and run an ad in it. I’m sorry. Our intentions were good.”(Zuckerman).

# Major components
PopupWindow widget is needed to create a variable for the popupwindow.
LayoutInflater is crucial to create the new layout file.
PopupWindow(View contentView, int width, int height, boolean focusable) : input the container then width, height and if you want it to be able to
be closed by touching oustide of the view window.
update is used to update the existing window to a different set state. (isn't mandatory)
setOnTouchListener is important to actually dismiss the popupWindow by touching anywhere outside the window.
showAtLocation(View parent, int gravity, int x, int y) the parent layout file, gravity settings, and the x, y coordinates for the popupwindow.

# How to use the app
First off compile and run the app, Press the button on the activity it should create a small light blue box with hello written in it. To
close the popup you could either touch outside of the box and or press the button once more.

To get these results:
-first off we need to reference the widgets and create variables for them.
-In the onCreate method referencing the layout and the button with findViewById.
-button to an onClickListener to create the view when the button is pressed.
-initialize the layoutinflater and then create the new layout window with the use of a ViewGroup to inflate it.
-Using showAtLocation to place the view window at a specific location in the layout while either adding or not adding gravity.
-closing the window by setting the container ViewGroup to an OnTouchListener to dismiss the popupWindow.

# Uses in my project
This could be a very useful tool for UI in my project. The CLock screen, where when i set a timezone a popup window would appear and 
display the name and time of the timezone selected. For the Weather screen it could pop up a window when the temperature drastically changes
and maybe have a button to lower the temperature vice versa and keep a log of it in the log file.

# References
https://developer.android.com/reference/android/widget/PopupWindow
https://android--code.blogspot.com/2016/01/android-popup-window-example.html
https://stackoverflow.com/questions/5944987/how-to-create-a-popup-window-popupwindow-in-android
https://www.forbes.com/sites/jaymcgregor/2014/08/15/the-man-who-invented-pop-up-ads-says-im-sorry/#24e645684ebe
