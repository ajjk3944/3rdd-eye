.class final Lxd/d$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxd/d;->i(Lqd/d;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lxd/d$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxd/d$d;

    invoke-direct {v0}, Lxd/d$d;-><init>()V

    sput-object v0, Lxd/d$d;->a:Lxd/d$d;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LIa/a;)Lgg/D;
    .locals 3

    const-string v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxd/d$d$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lxd/d$d$a;-><init>(LIa/a;Ldh/e;)V

    const/4 v2, 0x1

    invoke-static {v1, v0, v2, v1}, LQi/l;->c(Ldh/i;Lmh/p;ILjava/lang/Object;)Lgg/z;

    move-result-object v0

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object v0

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/z;->E(Lgg/y;)Lgg/z;

    move-result-object v0

    new-instance v1, Lxd/d$d$b;

    invoke-direct {v1, p1}, Lxd/d$d$b;-><init>(LIa/a;)V

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIa/a;

    invoke-virtual {p0, p1}, Lxd/d$d;->a(LIa/a;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
