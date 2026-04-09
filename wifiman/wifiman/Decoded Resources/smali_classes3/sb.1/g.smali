.class public abstract Lsb/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lkotlin/text/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkotlin/text/p;

    const-string/jumbo v1, "^\\p{Lower}+://?+.+$"

    invoke-direct {v0, v1}, Lkotlin/text/p;-><init>(Ljava/lang/String;)V

    sput-object v0, Lsb/g;->a:Lkotlin/text/p;

    return-void
.end method

.method public static final a(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lsb/g;->a:Lkotlin/text/p;

    invoke-virtual {v0, p0}, Lkotlin/text/p;->m(Ljava/lang/CharSequence;)Z

    move-result p0

    return p0
.end method
