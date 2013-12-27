package vxt.uielement.timedurationpicker;

interface OnCircleSeekBarChangeListener {

	public abstract void onProgressChanged(Object seekBar,
			int progress, boolean fromUser);

	public abstract void onScrollRelease(HoursPicker seekBar,
			int progress, boolean fromUser);
	
}