.class public final LB3/f;
.super LB3/g;
.source "SourceFile"


# direct methods
.method private constructor <init>(Ljava/lang/Class;Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, LB3/g;-><init>(Ljava/lang/Class;Ljava/lang/Object;LB3/h;)V

    return-void
.end method

.method public static d(J)LB3/f;
    .locals 2

    new-instance v0, LB3/f;

    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    invoke-direct {v0, v1, p0}, LB3/f;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    return-object v0
.end method
