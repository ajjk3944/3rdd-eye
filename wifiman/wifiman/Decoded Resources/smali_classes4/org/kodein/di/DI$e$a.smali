.class final synthetic Lorg/kodein/di/DI$e$a;
.super Lkotlin/jvm/internal/p;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/kodein/di/DI$e;->h()Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final a:Lorg/kodein/di/DI$e$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/kodein/di/DI$e$a;

    invoke-direct {v0}, Lorg/kodein/di/DI$e$a;-><init>()V

    sput-object v0, Lorg/kodein/di/DI$e$a;->a:Lorg/kodein/di/DI$e$a;

    return-void
.end method

.method constructor <init>()V
    .locals 6

    const-string v4, "simpleDispString()Ljava/lang/String;"

    const/4 v5, 0x0

    const/4 v1, 0x1

    const-class v2, Lorg/kodein/type/q;

    const-string v3, "simpleDispString"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/p;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a(Lorg/kodein/type/q;)Ljava/lang/String;
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lorg/kodein/type/q;->i()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lorg/kodein/type/q;

    invoke-virtual {p0, p1}, Lorg/kodein/di/DI$e$a;->a(Lorg/kodein/type/q;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
