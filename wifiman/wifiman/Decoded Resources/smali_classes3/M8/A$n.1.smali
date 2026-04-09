.class final LM8/A$n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/A;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LM8/A$n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM8/A$n;

    invoke-direct {v0}, LM8/A$n;-><init>()V

    sput-object v0, LM8/A$n;->a:LM8/A$n;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lde/E;Ljava/lang/Boolean;)Lic/b;
    .locals 1

    const-string/jumbo v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "searchMode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p1, Lic/b;->NETWORKS:Lic/b;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lde/E;->d()Lic/b;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lde/E;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2}, LM8/A$n;->a(Lde/E;Ljava/lang/Boolean;)Lic/b;

    move-result-object p1

    return-object p1
.end method
