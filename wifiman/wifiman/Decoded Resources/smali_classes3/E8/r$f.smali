.class final LE8/r$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/r;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LE8/r$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LE8/r$f;

    invoke-direct {v0}, LE8/r$f;-><init>()V

    sput-object v0, LE8/r$f;->a:LE8/r$f;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lmd/a;)LT7/c;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lmd/a;->g()LT7/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmd/a;

    invoke-virtual {p0, p1}, LE8/r$f;->a(Lmd/a;)LT7/c;

    move-result-object p1

    return-object p1
.end method
