.class public abstract Lbi/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LBh/F;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LBh/F;

    const-string v1, "ResolutionAnchorProvider"

    invoke-direct {v0, v1}, LBh/F;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbi/s;->a:LBh/F;

    return-void
.end method

.method public static final a(LBh/G;)LBh/G;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lbi/s;->a:LBh/F;

    invoke-interface {p0, v0}, LBh/G;->b0(LBh/F;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lf/d;->a(Ljava/lang/Object;)V

    const/4 p0, 0x0

    return-object p0
.end method
