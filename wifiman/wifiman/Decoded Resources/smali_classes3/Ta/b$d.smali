.class final LTa/b$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LTa/b;->c(Landroid/content/ContentResolver;)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LTa/b$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LTa/b$d;

    invoke-direct {v0}, LTa/b$d;-><init>()V

    sput-object v0, LTa/b$d;->a:LTa/b$d;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "Failed to get Settings.Secure.ANDROID_ID"

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LTa/b$d;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
