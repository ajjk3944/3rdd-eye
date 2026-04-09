.class public final synthetic Lu8/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/a;


# instance fields
.field public final synthetic a:Lu8/d;


# direct methods
.method public synthetic constructor <init>(Lu8/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu8/c;->a:Lu8/d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lu8/c;->a:Lu8/d;

    invoke-static {v0}, Lu8/d;->c(Lu8/d;)V

    return-void
.end method
