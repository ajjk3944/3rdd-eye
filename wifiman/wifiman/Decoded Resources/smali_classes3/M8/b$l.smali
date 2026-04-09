.class final LM8/b$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/b;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LM8/b$l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM8/b$l;

    invoke-direct {v0}, LM8/b$l;-><init>()V

    sput-object v0, LM8/b$l;->a:LM8/b$l;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lxf/b;)Z
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p1, p1, Lxf/b$a;

    return p1
.end method

.method public bridge synthetic test(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lxf/b;

    invoke-virtual {p0, p1}, LM8/b$l;->a(Lxf/b;)Z

    move-result p1

    return p1
.end method
