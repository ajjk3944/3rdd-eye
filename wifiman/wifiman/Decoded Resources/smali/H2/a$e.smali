.class public interface abstract LH2/a$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LH2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "e"
.end annotation


# static fields
.field public static final a:LH2/a$e;

.field public static final b:LH2/a$e;

.field public static final c:LH2/a$e;

.field public static final d:LH2/a$e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LH2/a$e$a;

    invoke-direct {v0}, LH2/a$e$a;-><init>()V

    sput-object v0, LH2/a$e;->a:LH2/a$e;

    new-instance v0, LH2/a$e$b;

    invoke-direct {v0}, LH2/a$e$b;-><init>()V

    sput-object v0, LH2/a$e;->b:LH2/a$e;

    new-instance v1, LH2/a$e$c;

    invoke-direct {v1}, LH2/a$e$c;-><init>()V

    sput-object v1, LH2/a$e;->c:LH2/a$e;

    sput-object v0, LH2/a$e;->d:LH2/a$e;

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/Throwable;)V
.end method
