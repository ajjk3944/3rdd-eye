.class final LM8/b$j;
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
.field public static final a:LM8/b$j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM8/b$j;

    invoke-direct {v0}, LM8/b$j;-><init>()V

    sput-object v0, LM8/b$j;->a:LM8/b$j;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Boolean;)Lxf/b;
    .locals 1

    const-string/jumbo v0, "hasSignal"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lxf/b$a;->a:Lxf/b$a;

    goto :goto_0

    :cond_0
    sget-object p1, Lxf/b$b;->a:Lxf/b$b;

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, LM8/b$j;->a(Ljava/lang/Boolean;)Lxf/b;

    move-result-object p1

    return-object p1
.end method
