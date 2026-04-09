.class public final synthetic Li8/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Li8/y;

.field public final synthetic b:Lgg/o;


# direct methods
.method public synthetic constructor <init>(Li8/y;Lgg/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li8/t;->a:Li8/y;

    iput-object p2, p0, Li8/t;->b:Lgg/o;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Li8/t;->a:Li8/y;

    iget-object v1, p0, Li8/t;->b:Lgg/o;

    check-cast p1, LV4/b;

    invoke-static {v0, v1, p1}, Li8/y;->d(Li8/y;Lgg/o;LV4/b;)LYg/J;

    move-result-object p1

    return-object p1
.end method
