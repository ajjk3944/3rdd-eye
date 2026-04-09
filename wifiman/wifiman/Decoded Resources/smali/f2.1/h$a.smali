.class public final Lf2/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf2/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Lf2/B;

.field private b:Z

.field private c:Ljava/lang/Object;

.field private d:Z

.field private e:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lf2/h;
    .locals 8

    iget-object v0, p0, Lf2/h$a;->a:Lf2/B;

    if-nez v0, :cond_0

    sget-object v0, Lf2/B;->c:Lf2/B$q;

    iget-object v1, p0, Lf2/h$a;->c:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lf2/B$q;->a(Ljava/lang/Object;)Lf2/B;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    move-object v3, v0

    new-instance v0, Lf2/h;

    iget-boolean v4, p0, Lf2/h$a;->b:Z

    iget-object v5, p0, Lf2/h$a;->c:Ljava/lang/Object;

    iget-boolean v6, p0, Lf2/h$a;->d:Z

    iget-boolean v7, p0, Lf2/h$a;->e:Z

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Lf2/h;-><init>(Lf2/B;ZLjava/lang/Object;ZZ)V

    return-object v0
.end method

.method public final b(Z)Lf2/h$a;
    .locals 0

    iput-boolean p1, p0, Lf2/h$a;->b:Z

    return-object p0
.end method

.method public final c(Lf2/B;)Lf2/h$a;
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lf2/h$a;->a:Lf2/B;

    return-object p0
.end method
