.class LNh/V;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# static fields
.field public static final a:LNh/V;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LNh/V;

    invoke-direct {v0}, LNh/V;-><init>()V

    sput-object v0, LNh/V;->a:LNh/V;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LQh/q;

    invoke-static {p1}, LNh/a0;->g0(LQh/q;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
