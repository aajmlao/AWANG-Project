import Link from "next/link"
import Image from "next/image"
// import logo from "../../app/components/logo.png"

export default function LandingPage() {
    return(
        <div className="d-flex">
            <div className="flex-grow-1">
                AWANG
            </div>
            <div className="p-2">
            <Link href="../signup/signup" className="p-3 ">
                    <button className="btn btn-primary">
                        Sign Up
                    </button>
                </Link>
                <Link href="../login/login" className="p-3">
                    <button className="btn btn-primary">
                        log In
                    </button>
                </Link>
            </div>
        </div>
    )
}
