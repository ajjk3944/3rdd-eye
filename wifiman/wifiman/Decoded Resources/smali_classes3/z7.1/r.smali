.class public final synthetic Lz7/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/k;


# instance fields
.field public final synthetic a:Lgg/y;

.field public final synthetic b:Lz7/u;


# direct methods
.method public synthetic constructor <init>(Lgg/y;Lz7/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz7/r;->a:Lgg/y;

    iput-object p2, p0, Lz7/r;->b:Lz7/u;

    return-void
.end method


# virtual methods
.method public final a(Lgg/j;)V
    .locals 2

    iget-object v0, p0, Lz7/r;->a:Lgg/y;

    iget-object v1, p0, Lz7/r;->b:Lz7/u;

    invoke-static {v0, v1, p1}, Lz7/u$a;->a(Lgg/y;Lz7/u;Lgg/j;)V

    return-void
.end method
