.class public final Lgd/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgd/a$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgd/b$a;
    }
.end annotation


# static fields
.field public static final b:Lgd/b$a;


# instance fields
.field private final a:Lgg/z;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgd/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lgd/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lgd/b;->b:Lgd/b$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lgd/b$c;

    invoke-direct {v0}, Lgd/b$c;-><init>()V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v0

    const-string v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object v0

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/z;->E(Lgg/y;)Lgg/z;

    move-result-object v0

    invoke-virtual {v0}, Lgg/z;->e()Lgg/z;

    move-result-object v0

    const-string v1, "cache(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lgd/b;->a:Lgg/z;

    return-void
.end method


# virtual methods
.method public a()Lgg/z;
    .locals 1

    iget-object v0, p0, Lgd/b;->a:Lgg/z;

    return-object v0
.end method
