.class LK6/A$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK6/A;-><init>(Ljava/lang/String;LP6/G;Lgg/s;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lhg/c;

.field final synthetic b:LK6/A;


# direct methods
.method constructor <init>(LK6/A;Lhg/c;)V
    .locals 0

    iput-object p1, p0, LK6/A$d;->b:LK6/A;

    iput-object p2, p0, LK6/A$d;->a:Lhg/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, LK6/A$d;->a:Lhg/c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    return-void
.end method
