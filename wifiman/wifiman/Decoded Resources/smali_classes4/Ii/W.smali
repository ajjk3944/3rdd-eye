.class LIi/W;
.super LIi/a;
.source "SourceFile"

# interfaces
.implements LIi/V;


# direct methods
.method public constructor <init>(Ldh/i;Z)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, p2}, LIi/a;-><init>(Ldh/i;ZZ)V

    return-void
.end method

.method static synthetic R0(LIi/W;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LIi/D0;->x(Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
.method public await(Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, LIi/W;->R0(LIi/W;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getCompleted()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LIi/D0;->O()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
