.class public final LHe/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LHe/p$a;
    }
.end annotation


# static fields
.field public static final b:LHe/p$a;


# instance fields
.field private final a:LT/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LHe/p$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LHe/p$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LHe/p;->b:LHe/p$a;

    return-void
.end method

.method public constructor <init>(LT/q0;)V
    .locals 1

    const-string v0, "isVisible"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHe/p;->a:LT/q0;

    return-void
.end method

.method public static final synthetic a(LHe/p;)LT/q0;
    .locals 0

    iget-object p0, p0, LHe/p;->a:LT/q0;

    return-object p0
.end method


# virtual methods
.method public final b()V
    .locals 2

    iget-object v0, p0, LHe/p;->a:LT/q0;

    sget-object v1, LHe/q;->HIDDEN:LHe/q;

    invoke-interface {v0, v1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final c()Z
    .locals 2

    iget-object v0, p0, LHe/p;->a:LT/q0;

    invoke-interface {v0}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LHe/q;->VISIBLE:LHe/q;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, LHe/p;->a:LT/q0;

    sget-object v1, LHe/q;->VISIBLE:LHe/q;

    invoke-interface {v0, v1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LHe/p;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LHe/p;

    iget-object v1, p0, LHe/p;->a:LT/q0;

    iget-object p1, p1, LHe/p;->a:LT/q0;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LHe/p;->a:LT/q0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LHe/p;->a:LT/q0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "State(isVisible="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
