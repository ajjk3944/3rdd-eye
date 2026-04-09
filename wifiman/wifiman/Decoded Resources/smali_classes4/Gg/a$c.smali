.class final LGg/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LGg/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lgg/y;
    .locals 1

    sget-object v0, LGg/a$d;->a:Lgg/y;

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LGg/a$c;->a()Lgg/y;

    move-result-object v0

    return-object v0
.end method
