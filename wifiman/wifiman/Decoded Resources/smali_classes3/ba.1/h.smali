.class public final synthetic Lba/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LIi/N;

.field public final synthetic b:Lba/l;


# direct methods
.method public synthetic constructor <init>(LIi/N;Lba/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lba/h;->a:LIi/N;

    iput-object p2, p0, Lba/h;->b:Lba/l;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lba/h;->a:LIi/N;

    iget-object v1, p0, Lba/h;->b:Lba/l;

    invoke-static {v0, v1}, Lba/j;->c(LIi/N;Lba/l;)LYg/J;

    move-result-object v0

    return-object v0
.end method
