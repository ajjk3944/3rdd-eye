.class final LE8/A$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/A;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LE8/A$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LE8/A$d;

    invoke-direct {v0}, LE8/A$d;-><init>()V

    sput-object v0, LE8/A$d;->a:LE8/A$d;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    check-cast p2, LDd/a;

    check-cast p3, Ljf/f;

    invoke-virtual {p0, p1, p2, p3}, LE8/A$d;->b(Ljava/lang/Boolean;LDd/a;Ljf/f;)Ll9/a;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/Boolean;LDd/a;Ljf/f;)Ll9/a;
    .locals 1

    const-string/jumbo v0, "uispControllerApiAvailable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "settings"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "params"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll9/a;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p3}, Ljf/f;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Ljf/e;

    invoke-virtual {p2}, LDd/a;->d()Z

    move-result p2

    invoke-direct {p1, p2}, Ljf/e;-><init>(Z)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-direct {v0, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
