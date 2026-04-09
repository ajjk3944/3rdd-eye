.class public final synthetic Lz7/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/k;


# instance fields
.field public final synthetic a:Lz7/d;

.field public final synthetic b:Ljava/lang/Integer;

.field public final synthetic c:Lo7/a;


# direct methods
.method public synthetic constructor <init>(Lz7/d;Ljava/lang/Integer;Lo7/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz7/b;->a:Lz7/d;

    iput-object p2, p0, Lz7/b;->b:Ljava/lang/Integer;

    iput-object p3, p0, Lz7/b;->c:Lo7/a;

    return-void
.end method


# virtual methods
.method public final a(Lgg/j;)V
    .locals 3

    iget-object v0, p0, Lz7/b;->a:Lz7/d;

    iget-object v1, p0, Lz7/b;->b:Ljava/lang/Integer;

    iget-object v2, p0, Lz7/b;->c:Lo7/a;

    invoke-static {v0, v1, v2, p1}, Lz7/d$a;->b(Lz7/d;Ljava/lang/Integer;Lo7/a;Lgg/j;)V

    return-void
.end method
