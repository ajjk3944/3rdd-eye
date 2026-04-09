.class public final synthetic Lo2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/k;


# instance fields
.field public final synthetic a:[Ljava/lang/String;

.field public final synthetic b:Lm2/q;


# direct methods
.method public synthetic constructor <init>([Ljava/lang/String;Lm2/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo2/b;->a:[Ljava/lang/String;

    iput-object p2, p0, Lo2/b;->b:Lm2/q;

    return-void
.end method


# virtual methods
.method public final a(Lgg/j;)V
    .locals 2

    iget-object v0, p0, Lo2/b;->a:[Ljava/lang/String;

    iget-object v1, p0, Lo2/b;->b:Lm2/q;

    invoke-static {v0, v1, p1}, Lo2/d;->a([Ljava/lang/String;Lm2/q;Lgg/j;)V

    return-void
.end method
