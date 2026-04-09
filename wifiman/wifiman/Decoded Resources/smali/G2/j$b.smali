.class final LG2/j$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX2/a$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LG2/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field final a:Ljava/security/MessageDigest;

.field private final b:LX2/c;


# direct methods
.method constructor <init>(Ljava/security/MessageDigest;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LX2/c;->a()LX2/c;

    move-result-object v0

    iput-object v0, p0, LG2/j$b;->b:LX2/c;

    iput-object p1, p0, LG2/j$b;->a:Ljava/security/MessageDigest;

    return-void
.end method


# virtual methods
.method public b()LX2/c;
    .locals 1

    iget-object v0, p0, LG2/j$b;->b:LX2/c;

    return-object v0
.end method
