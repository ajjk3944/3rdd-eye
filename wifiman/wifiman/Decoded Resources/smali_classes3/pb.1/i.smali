.class public final synthetic Lpb/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/e;


# instance fields
.field public final synthetic a:Lpb/l;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lgg/t;


# direct methods
.method public synthetic constructor <init>(Lpb/l;Ljava/lang/String;Lgg/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpb/i;->a:Lpb/l;

    iput-object p2, p0, Lpb/i;->b:Ljava/lang/String;

    iput-object p3, p0, Lpb/i;->c:Lgg/t;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 3

    iget-object v0, p0, Lpb/i;->a:Lpb/l;

    iget-object v1, p0, Lpb/i;->b:Ljava/lang/String;

    iget-object v2, p0, Lpb/i;->c:Lgg/t;

    invoke-static {v0, v1, v2}, Lpb/l;->b(Lpb/l;Ljava/lang/String;Lgg/t;)V

    return-void
.end method
