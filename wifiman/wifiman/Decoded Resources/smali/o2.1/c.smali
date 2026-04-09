.class public final synthetic Lo2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/a;


# instance fields
.field public final synthetic a:Lm2/q;

.field public final synthetic b:Landroidx/room/c$c;


# direct methods
.method public synthetic constructor <init>(Lm2/q;Landroidx/room/c$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo2/c;->a:Lm2/q;

    iput-object p2, p0, Lo2/c;->b:Landroidx/room/c$c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lo2/c;->a:Lm2/q;

    iget-object v1, p0, Lo2/c;->b:Landroidx/room/c$c;

    invoke-static {v0, v1}, Lo2/d;->b(Lm2/q;Landroidx/room/c$c;)V

    return-void
.end method
