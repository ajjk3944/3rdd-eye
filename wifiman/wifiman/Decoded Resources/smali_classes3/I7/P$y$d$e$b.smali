.class final LI7/P$y$d$e$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/P$y$d$e;->n(Lcom/ubnt/teleport/unifi/stun/TeleportStun$a;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LI7/P$y$d$e$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LI7/P$y$d$e$b;

    invoke-direct {v0}, LI7/P$y$d$e$b;-><init>()V

    sput-object v0, LI7/P$y$d$e$b;->a:LI7/P$y$d$e$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    new-instance v0, LI7/P$y$d$e$b$a;

    invoke-direct {v0, p1}, LI7/P$y$d$e$b$a;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v0, p1}, LN7/a;->c(Lmh/a;Ljava/lang/Throwable;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LI7/P$y$d$e$b;->a(Ljava/lang/Throwable;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
