.class public final synthetic LF9/Z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lk0/e;

.field public final synthetic b:Landroidx/compose/ui/focus/o;


# direct methods
.method public synthetic constructor <init>(Lk0/e;Landroidx/compose/ui/focus/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF9/Z;->a:Lk0/e;

    iput-object p2, p0, LF9/Z;->b:Landroidx/compose/ui/focus/o;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LF9/Z;->a:Lk0/e;

    iget-object v1, p0, LF9/Z;->b:Landroidx/compose/ui/focus/o;

    invoke-static {v0, v1}, LF9/c0;->a(Lk0/e;Landroidx/compose/ui/focus/o;)LYg/J;

    move-result-object v0

    return-object v0
.end method
