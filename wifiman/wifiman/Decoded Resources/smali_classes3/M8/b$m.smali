.class final LM8/b$m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/b;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LM8/b$m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM8/b$m;

    invoke-direct {v0}, LM8/b$m;-><init>()V

    sput-object v0, LM8/b$m;->a:LM8/b$m;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lxf/d;)La8/b;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, La8/b;->c:La8/b$a;

    invoke-virtual {p1}, Lxf/d;->a()Lh9/a;

    move-result-object p1

    invoke-virtual {v0, p1}, La8/b$a;->b(Lh9/a;)La8/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lxf/d;

    invoke-virtual {p0, p1}, LM8/b$m;->a(Lxf/d;)La8/b;

    move-result-object p1

    return-object p1
.end method
