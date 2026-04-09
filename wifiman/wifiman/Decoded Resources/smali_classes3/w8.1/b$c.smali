.class final Lw8/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw8/b;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lw8/b$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw8/b$c;

    invoke-direct {v0}, Lw8/b$c;-><init>()V

    sput-object v0, Lw8/b$c;->a:Lw8/b$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lmd/a;)Ljava/lang/Boolean;
    .locals 1

    const-string/jumbo v0, "settings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lmd/a;->e()LT7/b;

    move-result-object p1

    sget-object v0, LT7/b;->DARK:LT7/b;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmd/a;

    invoke-virtual {p0, p1}, Lw8/b$c;->a(Lmd/a;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
