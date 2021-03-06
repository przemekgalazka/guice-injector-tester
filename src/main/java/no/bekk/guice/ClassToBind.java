package no.bekk.guice;

import com.google.inject.Inject;

public class ClassToBind implements BindableClass{
	
	private ArrayListWrapper arrayListWrapper;
	@Inject
	private StringBuffer result;

	@Inject
	public ClassToBind(ArrayListWrapper arrayListWrapper) {
		this.arrayListWrapper = arrayListWrapper;
	}
	
	public String toString() {
		result.delete(0, result.length());
		for (String s : this.arrayListWrapper.fetchList()) {
			result.append(s + " ");
		}
		return result.toString();
	}

}
