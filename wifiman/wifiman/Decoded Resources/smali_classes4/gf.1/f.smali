.class public final synthetic Lgf/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lgf/b;

.field public final synthetic b:LC/C;

.field public final synthetic c:Lgf/c;


# direct methods
.method public synthetic constructor <init>(Lgf/b;LC/C;Lgf/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgf/f;->a:Lgf/b;

    iput-object p2, p0, Lgf/f;->b:LC/C;

    iput-object p3, p0, Lgf/f;->c:Lgf/c;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lgf/f;->a:Lgf/b;

    iget-object v1, p0, Lgf/f;->b:LC/C;

    iget-object v2, p0, Lgf/f;->c:Lgf/c;

    invoke-static {v0, v1, v2}, Lgf/j;->e(Lgf/b;LC/C;Lgf/c;)LYg/J;

    move-result-object v0

    return-object v0
.end method
