.class final Lvj/g$g;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvj/g;->g(Lrj/N5;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lvj/g$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lvj/g$g;

    invoke-direct {v0}, Lvj/g$g;-><init>()V

    sput-object v0, Lvj/g$g;->a:Lvj/g$g;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LYg/y;)LYg/s;
    .locals 1

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/y;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/kodein/di/DI$e;

    invoke-virtual {p1}, LYg/y;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Luj/d;

    invoke-static {v0, p1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/y;

    invoke-virtual {p0, p1}, Lvj/g$g;->a(LYg/y;)LYg/s;

    move-result-object p1

    return-object p1
.end method
