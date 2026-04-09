.class final Ln8/a$y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln8/a;-><init>(Lorg/kodein/di/DI;Ln8/a$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ln8/a$y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln8/a$y;

    invoke-direct {v0}, Ln8/a$y;-><init>()V

    sput-object v0, Ln8/a$y;->a:Ln8/a$y;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Ll9/a;
    .locals 4

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LCc/a;

    new-instance v0, Ll9/a;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-interface {p1}, LCc/a;->p()Lwc/a;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lwc/a;->c()Z

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    invoke-interface {p1}, LCc/a;->p()Lwc/a;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lwc/a;->d()Lh9/a;

    move-result-object v1

    :cond_0
    invoke-direct {v0, v1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Ln8/a$y;->a(Ll9/a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
