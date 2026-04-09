.class public final synthetic Lz7/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# instance fields
.field public final synthetic a:Lz7/g;

.field public final synthetic b:Lz7/z;


# direct methods
.method public synthetic constructor <init>(Lz7/g;Lz7/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz7/h;->a:Lz7/g;

    iput-object p2, p0, Lz7/h;->b:Lz7/z;

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 2

    iget-object v0, p0, Lz7/h;->a:Lz7/g;

    iget-object v1, p0, Lz7/h;->b:Lz7/z;

    invoke-static {v0, v1, p1}, Lz7/g$c;->a(Lz7/g;Lz7/z;Lgg/c;)V

    return-void
.end method
