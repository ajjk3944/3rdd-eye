.class final LS2/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LS2/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/Class;

.field final b:LC2/j;


# direct methods
.method constructor <init>(Ljava/lang/Class;LC2/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS2/f$a;->a:Ljava/lang/Class;

    iput-object p2, p0, LS2/f$a;->b:LC2/j;

    return-void
.end method


# virtual methods
.method a(Ljava/lang/Class;)Z
    .locals 1

    iget-object v0, p0, LS2/f$a;->a:Ljava/lang/Class;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    return p1
.end method
