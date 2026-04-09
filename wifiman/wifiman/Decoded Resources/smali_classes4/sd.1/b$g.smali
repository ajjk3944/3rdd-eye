.class final Lsd/b$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsd/b;-><init>(Ljd/b;LSd/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lsd/b$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lsd/b$g;

    invoke-direct {v0}, Lsd/b$g;-><init>()V

    sput-object v0, Lsd/b$g;->a:Lsd/b$g;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Ll9/a;
    .locals 2

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljd/a$b;

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljd/a$b;->b()LCc/a;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, LCc/a;->j()LDc/j;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, LDc/j;->J()LQc/a$b;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_1

    move-object v0, p1

    :cond_1
    new-instance p1, Ll9/a;

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Lsd/b$g;->a(Ll9/a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
