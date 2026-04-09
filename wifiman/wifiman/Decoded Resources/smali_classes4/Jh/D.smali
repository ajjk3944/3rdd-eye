.class public final LJh/D;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJh/D$b;
    }
.end annotation


# static fields
.field public static final d:LJh/D$b;

.field private static final e:LJh/D;


# instance fields
.field private final a:LJh/G;

.field private final b:Lmh/l;

.field private final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LJh/D$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LJh/D$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LJh/D;->d:LJh/D$b;

    new-instance v0, LJh/D;

    const/4 v2, 0x1

    invoke-static {v1, v2, v1}, LJh/B;->b(LYg/k;ILjava/lang/Object;)LJh/G;

    move-result-object v1

    sget-object v2, LJh/D$a;->a:LJh/D$a;

    invoke-direct {v0, v1, v2}, LJh/D;-><init>(LJh/G;Lmh/l;)V

    sput-object v0, LJh/D;->e:LJh/D;

    return-void
.end method

.method public constructor <init>(LJh/G;Lmh/l;)V
    .locals 1

    const-string v0, "jsr305"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getReportLevelForAnnotation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJh/D;->a:LJh/G;

    iput-object p2, p0, LJh/D;->b:Lmh/l;

    invoke-virtual {p1}, LJh/G;->f()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-static {}, LJh/B;->e()LZh/c;

    move-result-object p1

    invoke-interface {p2, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, LJh/O;->IGNORE:LJh/O;

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    iput-boolean p1, p0, LJh/D;->c:Z

    return-void
.end method

.method public static final synthetic a()LJh/D;
    .locals 1

    sget-object v0, LJh/D;->e:LJh/D;

    return-object v0
.end method


# virtual methods
.method public final b()Z
    .locals 1

    iget-boolean v0, p0, LJh/D;->c:Z

    return v0
.end method

.method public final c()Lmh/l;
    .locals 1

    iget-object v0, p0, LJh/D;->b:Lmh/l;

    return-object v0
.end method

.method public final d()LJh/G;
    .locals 1

    iget-object v0, p0, LJh/D;->a:LJh/G;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "JavaTypeEnhancementState(jsr305="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LJh/D;->a:LJh/G;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", getReportLevelForAnnotation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LJh/D;->b:Lmh/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
