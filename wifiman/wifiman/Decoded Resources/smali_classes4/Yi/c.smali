.class public interface abstract LYi/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYi/c$a;
    }
.end annotation


# static fields
.field public static final a:LYi/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, LYi/c$a;->a:LYi/c$a;

    sput-object v0, LYi/c;->a:LYi/c$a;

    return-void
.end method

.method public static synthetic j(LYi/c;LXi/f;ILVi/a;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-nez p6, :cond_1

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    :cond_0
    invoke-interface {p0, p1, p2, p3, p4}, LYi/c;->p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: decodeSerializableElement"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract A(LXi/f;I)F
.end method

.method public B()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract C(LXi/f;I)S
.end method

.method public abstract E(LXi/f;I)LYi/e;
.end method

.method public abstract H(LXi/f;I)B
.end method

.method public abstract a()Lcj/e;
.end method

.method public abstract b(LXi/f;)V
.end method

.method public abstract h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public abstract i(LXi/f;I)I
.end method

.method public abstract k(LXi/f;)I
.end method

.method public abstract o(LXi/f;I)D
.end method

.method public abstract p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public abstract q(LXi/f;I)J
.end method

.method public abstract u(LXi/f;I)Z
.end method

.method public abstract w(LXi/f;I)Ljava/lang/String;
.end method

.method public x(LXi/f;)I
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, -0x1

    return p1
.end method

.method public abstract z(LXi/f;I)C
.end method
