.class final Lxd/d$f;
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
.field public static final a:Lxd/d$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxd/d$f;

    invoke-direct {v0}, Lxd/d$f;-><init>()V

    sput-object v0, Lxd/d$f;->a:Lxd/d$f;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LIa/l;)Lxd/d$a;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxd/d$a;

    invoke-virtual {p1}, LIa/l;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lxd/d$a;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIa/l;

    invoke-virtual {p0, p1}, Lxd/d$f;->a(LIa/l;)Lxd/d$a;

    move-result-object p1

    return-object p1
.end method
