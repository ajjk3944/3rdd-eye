.class final LM/r$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM/r$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LM/r$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM/r$a$a;

    invoke-direct {v0}, LM/r$a$a;-><init>()V

    sput-object v0, LM/r$a$a;->a:LM/r$a$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LM/k;I)J
    .locals 0

    invoke-virtual {p1}, LM/k;->c()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p2}, LF/M;->c(Ljava/lang/CharSequence;I)J

    move-result-wide p1

    return-wide p1
.end method
