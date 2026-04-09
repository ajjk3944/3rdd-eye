.class public final synthetic Leb/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Leb/c;


# direct methods
.method public synthetic constructor <init>(Leb/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leb/b;->a:Leb/c;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Leb/b;->a:Leb/c;

    invoke-static {v0}, Leb/c;->d(Leb/c;)Lgg/i;

    move-result-object v0

    return-object v0
.end method
