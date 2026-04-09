.class Lw4/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw4/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw4/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private final a:Lo4/v;


# direct methods
.method private constructor <init>(Lo4/v;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lw4/h$b;->a:Lo4/v;

    return-void
.end method

.method synthetic constructor <init>(Lo4/v;Lw4/h$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lw4/h$b;-><init>(Lo4/v;)V

    return-void
.end method
