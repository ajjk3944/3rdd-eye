.class final LW8/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW8/c;-><init>(LG6/G;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LW8/c$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LW8/c$b;

    invoke-direct {v0}, LW8/c$b;-><init>()V

    sput-object v0, LW8/c$b;->a:LW8/c$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LW8/a;)V
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/ui/btle/rxandroidble/a;->a:Lcom/ui/btle/rxandroidble/a;

    invoke-virtual {v0}, Lcom/ui/btle/rxandroidble/a;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, LW8/c$b$a;

    invoke-direct {v0, p1}, LW8/c$b$a;-><init>(LW8/a;)V

    invoke-static {v0}, LX8/a;->c(Lmh/a;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LW8/a;

    invoke-virtual {p0, p1}, LW8/c$b;->a(LW8/a;)V

    return-void
.end method
