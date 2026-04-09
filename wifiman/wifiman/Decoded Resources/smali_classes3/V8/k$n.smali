.class final LV8/k$n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV8/k;-><init>(LG6/G;Lh9/a;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;LV8/e$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LV8/k$n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LV8/k$n;

    invoke-direct {v0}, LV8/k$n;-><init>()V

    sput-object v0, LV8/k$n;->a:LV8/k$n;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/btle/v2/a$a;)V
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LV8/k$n$a;

    invoke-direct {v0, p1}, LV8/k$n$a;-><init>(Lcom/ui/btle/v2/a$a;)V

    invoke-static {v0}, LX8/a;->c(Lmh/a;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/ui/btle/v2/a$a;

    invoke-virtual {p0, p1}, LV8/k$n;->a(Lcom/ui/btle/v2/a$a;)V

    return-void
.end method
