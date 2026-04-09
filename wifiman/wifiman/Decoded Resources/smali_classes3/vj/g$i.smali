.class final Lvj/g$i;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvj/g;->i(Lorg/kodein/di/DI$e;Lorg/kodein/di/DI$e;)Ljava/lang/IllegalStateException;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lvj/g$i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lvj/g$i;

    invoke-direct {v0}, Lvj/g$i;-><init>()V

    sput-object v0, Lvj/g$i;->a:Lvj/g$i;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lorg/kodein/di/DI$e;)Ljava/lang/CharSequence;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lorg/kodein/di/DI$e;->j()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lorg/kodein/di/DI$e;

    invoke-virtual {p0, p1}, Lvj/g$i;->a(Lorg/kodein/di/DI$e;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
