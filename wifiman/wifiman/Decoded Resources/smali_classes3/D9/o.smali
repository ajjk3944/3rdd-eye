.class public final LD9/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD9/o$a;
    }
.end annotation


# static fields
.field public static final c:LD9/o$a;


# instance fields
.field private final a:LT/q0;

.field private final b:LT/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LD9/o$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LD9/o$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LD9/o;->c:LD9/o$a;

    return-void
.end method

.method public constructor <init>(LT/q0;)V
    .locals 2

    const-string/jumbo v0, "isVisible"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD9/o;->a:LT/q0;

    new-instance p1, Ll0/i;

    const/4 v0, 0x0

    invoke-direct {p1, v0, v0, v0, v0}, Ll0/i;-><init>(FFFF)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p1, v0, v1, v0}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, LD9/o;->b:LT/q0;

    return-void
.end method

.method public static final synthetic a(LD9/o;)LT/q0;
    .locals 0

    iget-object p0, p0, LD9/o;->a:LT/q0;

    return-object p0
.end method


# virtual methods
.method public final b()Ll0/i;
    .locals 1

    iget-object v0, p0, LD9/o;->b:LT/q0;

    invoke-interface {v0}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll0/i;

    return-object v0
.end method

.method public final c()V
    .locals 2

    iget-object v0, p0, LD9/o;->a:LT/q0;

    sget-object v1, LD9/p;->HIDDEN:LD9/p;

    invoke-interface {v0, v1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final d()Z
    .locals 2

    iget-object v0, p0, LD9/o;->a:LT/q0;

    invoke-interface {v0}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LD9/p;->VISIBLE:LD9/p;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final e(Ll0/i;)V
    .locals 8

    const-string/jumbo v0, "rect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LD9/o;->b:LT/q0;

    const/16 v6, 0xf

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Ll0/i;->d(Ll0/i;FFFFILjava/lang/Object;)Ll0/i;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LD9/o;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LD9/o;

    iget-object v1, p0, LD9/o;->a:LT/q0;

    iget-object p1, p1, LD9/o;->a:LT/q0;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final f()V
    .locals 2

    iget-object v0, p0, LD9/o;->a:LT/q0;

    sget-object v1, LD9/p;->VISIBLE:LD9/p;

    invoke-interface {v0, v1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LD9/o;->a:LT/q0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LD9/o;->a:LT/q0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "State(isVisible="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
