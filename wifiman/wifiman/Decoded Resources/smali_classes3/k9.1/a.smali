.class public final synthetic Lk9/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/a;


# instance fields
.field public final synthetic a:Lmh/l;

.field public final synthetic b:Ljava/lang/Long;


# direct methods
.method public synthetic constructor <init>(Lmh/l;Ljava/lang/Long;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk9/a;->a:Lmh/l;

    iput-object p2, p0, Lk9/a;->b:Ljava/lang/Long;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lk9/a;->a:Lmh/l;

    iget-object v1, p0, Lk9/a;->b:Ljava/lang/Long;

    invoke-static {v0, v1}, Lk9/e;->c(Lmh/l;Ljava/lang/Long;)V

    return-void
.end method
