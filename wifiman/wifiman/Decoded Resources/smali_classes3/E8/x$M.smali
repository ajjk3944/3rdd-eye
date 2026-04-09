.class final LE8/x$M;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/x;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LE8/x$M;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LE8/x$M;

    invoke-direct {v0}, LE8/x$M;-><init>()V

    sput-object v0, LE8/x$M;->a:LE8/x$M;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LE8/k;)LDj/a;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LE8/k;->k()Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LE8/k;

    invoke-virtual {p0, p1}, LE8/x$M;->a(LE8/k;)LDj/a;

    move-result-object p1

    return-object p1
.end method
